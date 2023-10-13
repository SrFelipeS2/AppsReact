import { IonButton, IonButtons, IonCard, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonInput, IonItem, IonMenuButton, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import { useHistory, useParams, useRouteMatch } from 'react-router';
import { add, checkbox, checkmark, close, pencil, save } from 'ionicons/icons';
import { useEffect, useState } from 'react';
import { RemoveSuppliers, SaveEditSuppliers, searchSupplierById, searchSuppliers } from './SupplierApi';
import Supplier from './Supplier';

const SupplierEdit: React.FC = () => {
    const { name } = useParams<{ name: string; }>();

    const [supplier, setSupplier] = useState<Supplier>({});
    const history = useHistory();

    const routeMatch: any = useRouteMatch('/page/suppliers/:id');
    let id = routeMatch?.params?.id;

    useEffect(() => {
        search();
    }, [history.location.pathname])

    const search = async () => {
        if (id === 'new') {
            setSupplier({})
        }
        else {
            let result = await searchSupplierById(id);
            setSupplier(result)
        }
    }
    const save = () => {
        SaveEditSuppliers(supplier);
        history.push('/page/suppliers');
    }

    return (
        <IonPage>
            <IonHeader>
                <IonToolbar>
                    <IonButtons slot='start'>
                        <IonMenuButton />
                    </IonButtons>
                    <IonTitle>{name}</IonTitle>
                </IonToolbar>
            </IonHeader>
            <IonContent fullscreen>
                <IonHeader collapse='condense'>
                    <IonToolbar>
                        <IonTitle size='large'>{name}</IonTitle>
                    </IonToolbar>
                </IonHeader>
                <IonCard>
                    <IonTitle>{id === 'new' ? 'Agregar Proveedor' : 'Editar Proveedor'}</IonTitle>

                    <IonRow>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Nombre"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={supplier.name}
                                    onIonChange={e => supplier.name = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Email"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={supplier.email}
                                    onIonChange={e => supplier.email = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                    </IonRow>
                    <IonRow>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Telefono Empresarial"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={supplier.phone}
                                    onIonChange={e => supplier.phone = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Direccion"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={supplier.address}
                                    onIonChange={e => supplier.address = String(e.detail.value)}>
                                </IonInput>
                                <IonCol>
                                    <IonItem>
                                        <IonInput
                                            label="Pagina Web"
                                            labelPlacement="stacked"
                                            placeholder="Enter text"
                                            value={supplier.web}
                                            onIonChange={e => supplier.web = String(e.detail.value)}>
                                        </IonInput>
                                    </IonItem>
                                </IonCol>
                                <IonCol>
                                    <IonItem>
                                        <IonInput
                                            label="Telefono de Contacto"
                                            labelPlacement="stacked"
                                            placeholder="Enter text"
                                            value={supplier.contact}
                                            onIonChange={e => supplier.contact = String(e.detail.value)}>
                                        </IonInput>
                                    </IonItem>
                                </IonCol>
                                <IonButton
                                    onClick={save}
                                    color='success'
                                    fill='solid'
                                    slot='end'
                                    size='default'>
                                    <IonIcon icon={checkmark} />
                                    Guardar
                                </IonButton>
                            </IonItem>
                        </IonCol>
                    </IonRow>
                </IonCard>
            </IonContent>
        </IonPage >
    );
};

export default SupplierEdit;
