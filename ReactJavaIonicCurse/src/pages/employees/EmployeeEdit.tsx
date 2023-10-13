import { IonButton, IonButtons, IonCard, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonInput, IonItem, IonMenuButton, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import { useHistory, useParams, useRouteMatch } from 'react-router';
import { add, checkbox, checkmark, close, pencil, save } from 'ionicons/icons';
import { useEffect, useState } from 'react';
import { RemoveEmployees, SaveEditEmployees, searchEmployeeById, searchEmployees } from './EmployeeApi';
import Employee from './Employee';

const EmployeeEdit: React.FC = () => {
    const { name } = useParams<{ name: string; }>();

    const [employee, setEmployee] = useState<Employee>({});
    const history = useHistory();

    const routeMatch: any = useRouteMatch('/page/employees/:id');
    let id = routeMatch?.params?.id;
   

    useEffect(() => {
        search();
    }, [history.location.pathname])

    const search = async () => {
        if (id === 'new') {
            setEmployee({})
        }
        else {
            let result = await searchEmployeeById(id);
            setEmployee(result)
        }
    }
    const save = async () => {
        await SaveEditEmployees(employee);
        history.push('/page/employees');
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
                    <IonTitle>{id === 'new' ? 'Agregar Empleado' : 'Editar Empleado'}</IonTitle>

                    <IonRow>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Nombre"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={employee.firstname}
                                    onIonChange={e => employee.firstname = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Apellido"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={employee.lastname}
                                    onIonChange={e => employee.lastname = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Email"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={employee.email}
                                    onIonChange={e => employee.email = String(e.detail.value)}>
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
                                    value={employee.phone}
                                    onIonChange={e => employee.phone = String(e.detail.value)}>
                                </IonInput>
                            </IonItem>
                        </IonCol>
                        <IonCol>
                            <IonItem>
                                <IonInput
                                    label="Direccion"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={employee.address}
                                    onIonChange={e => employee.address = String(e.detail.value)}>
                                </IonInput>
                                <IonInput
                                    label="Salario"
                                    labelPlacement="stacked"
                                    placeholder="Enter text"
                                    value={employee.salary}
                                    onIonChange={e => employee.salary = Number(e.detail.value)}>
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

export default EmployeeEdit;
