import { IonButton, IonButtons, IonCard, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonInput, IonItem, IonMenuButton, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import { useHistory, useParams, useRouteMatch } from 'react-router';
import { add, checkbox, checkmark, close, pencil, save } from 'ionicons/icons';
import { useEffect, useState } from 'react';
import { RemoveCustomers, SaveEditCustomers, searchCustomerById, searchCustomers } from './CustomerApi';
import Customer from './Customer';

const CustomerEdit: React.FC = () => {
    const { name } = useParams<{ name: string;  }>();

    const [customer, setCustomer] = useState<Customer>({});
    const history = useHistory();

    const routeMatch: any = useRouteMatch('/page/customers/:id');
    let id = routeMatch?.params?.id;


    useEffect(() => {
        search();
    }, [history.location.pathname])

    const search = async () => {
        if (id === 'new') {
            setCustomer({});
        }else{
            let result =  await searchCustomerById(id);
            setCustomer(result);
        }
    }
    const save = async () => {
        await SaveEditCustomers(customer);
        history.push('/page/customers');
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
                    <IonTitle>{id === 'new' ? 'Agregar Cliente' : 'Editar Cliente'}</IonTitle>

                    <IonRow>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Nombre"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={customer.firstname}
                                    onIonChange={e => customer.firstname = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Apellido"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={customer.lastname}
                                    onIonChange={e => customer.lastname = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Email"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={customer.email}
                                    onIonChange={e => customer.email = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                    </IonRow>
                    <IonRow>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Telefono"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={customer.phone}
                                    onIonChange={e => customer.phone = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>                          
                                <IonInput
                                    label="Direccion"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={customer.address}
                                    onIonChange={e => customer.address = String(e.detail.value)}>
                                </IonInput>
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

export default CustomerEdit;
