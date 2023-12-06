//***************>en este fragmento de codigo uso un input text y ademas de esto capture el valor del input usando una funcion y almacenandolo en una variable, mostrandolo asi en un text normal
// import react, {useState} from 'react';
// import { StatusBar } from 'expo-status-bar';
// import { StyleSheet, Text, View, TextInput, Dimensions } from 'react-native';
// const width = Dimensions.get('window').width
// export default function App() {
//   const [texto, setTexto] = useState("este e un valor por defecto")
//   return (
//     <View style={styles.container}>
//       <Text>Texto: {texto}</Text>
//       <TextInput
//         style={styles.input}
//         placeholder='escribe aqui'
//         onChangeText={text => setTexto(text)}
//         defaultValue={texto}
//       />
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input:{
//     backgroundColor:'#eee',
//     height:40,
//     width:'100%',
//     borderBottomColor: '#ccc',
//     borderBottomWidth:1
//   },
//   container: {
//     flex: 1,
//     backgroundColor: '#fff',
//     alignItems: 'center',
//     justifyContent: 'center',
//   },
// });
//*****************>(uso basico de botones) en esta seccion de codigo lo que hicimos fue capturar el texto que tenemos en el input text mediante un boton y la informacion capturada se mostro en un componente de texto, usamos use state para pasar la informacion y hacer el manejo de datos mas optimo posible
// import React, {useState} from 'react';
// import { StatusBar } from 'expo-status-bar';
// import { StyleSheet, Text, View, TextInput, Dimensions, Button } from 'react-native';
// //const width = Dimensions.get('window').width
// export default function App() {
//   const [text, setText] = useState("este e un valor por defecto")
//   const [submit, setSubmit] = useState("")

//   return (
//     <View style={styles.container}>
//       <Text>Texto: {submit}</Text>
//       <TextInput
//         style={styles.input}
//         placeholder='escribe aqui'
//         onChangeText={t => setText(t)}
//         defaultValue={text}
//       />
//       <Button
//       onPress={()=>{
//           setSubmit(text)
//           alert('texto enviado con exito')
//       }}
//       title='transformar'></Button>
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input:{
//     //backgroundColor:'#eee',
//     height:40,
//     width:'100%',
//     borderBottomColor: '#ccc',
//     borderBottomWidth:1
//   },
//   container: {
//     flex: 1,
//     backgroundColor: '#fff',
//     alignItems: 'center',
//     justifyContent: 'center',
//   },
// });
//*****************>(botones para android 1 )aqui se usa un boton especifico de android 'TouchableHighlight' lo modificamos para que cambiara el color de fondo y la opacidad.
// import React, { useState } from "react";
// import { StatusBar } from "expo-status-bar";
// import {
//   StyleSheet,
//   Text,
//   View,
//   TextInput,
//   Dimensions,
//   TouchableHighlight,
// } from "react-native";
// //const width = Dimensions.get('window').width
// export default function App() {
//   const [text, setText] = useState("este e un valor por defecto");
//   const [submit, setSubmit] = useState("");

//   return (
//     <View style={styles.container}>
//       <Text>Texto: {submit}</Text>
//       <TextInput
//         style={styles.input}
//         placeholder="escribe aqui"
//         onChangeText={(t) => setText(t)}
//         defaultValue={text}
//       />
//       <TouchableHighlight
//         underlayColor={'red'}
//         activeOpacity={0.6}
//         onPress={() => {
//           setSubmit(text);
//           alert("texto enviado con exito");
//         }}
//       >
//         <Text>Aceptar</Text>
//       </TouchableHighlight>
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input: {
//     //backgroundColor:'#eee',
//     height: 40,
//     width: "100%",
//     borderBottomColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "center",
//     justifyContent: "center",
//   },
// });
//*****************>(botones para android 2 ) aqui se usa un boton especifico para Android 'TouchableNativeFeedback' que tiene un feedback muy visual, una animacion util para que el usuario identifique cuando toca el boton de manera rapida.
// import React, { useState } from "react";
// import { StatusBar } from "expo-status-bar";
// import {
//   StyleSheet,
//   Text,
//   View,
//   TextInput,
//   Dimensions,
//   TouchableNativeFeedback,
// } from "react-native";
// //const width = Dimensions.get('window').width
// export default function App() {
//   const [text, setText] = useState("este e un valor por defecto");
//   const [submit, setSubmit] = useState("");

//   return (
//     <View style={styles.container}>
//       <Text>Texto: {submit}</Text>
//       <TextInput
//         style={styles.input}
//         placeholder="escribe aqui"
//         onChangeText={(t) => setText(t)}
//         defaultValue={text}
//       />
//       <TouchableNativeFeedback
//         background={TouchableNativeFeedback.Ripple("#00f", true)}
//         onPress={() => {
//           setSubmit(text);
//           alert("texto enviado con exito");
//         }}
//       >
//         <View style={styles.view}>
//           <Text>Aceptar</Text>
//         </View>
//       </TouchableNativeFeedback>
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input: {
//     //backgroundColor:'#eee',
//     height: 40,
//     width: "100%",
//     borderBottomColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   view: {flex: 0.5},
// });
//*****************>(botones para android 3 ) aqui se usa un boton cuya cualidad mas importante es que cuando se presiona se vuelve transparente, para darle el feedback ditrecto al usuario el nombre del boton es: TouchableOpacity
// import React, { useState } from "react";
// import { StatusBar } from "expo-status-bar";
// import {
//   StyleSheet,
//   Text,
//   View,
//   TextInput,
//   Dimensions,
//   TouchableOpacity,
// } from "react-native";
// //const width = Dimensions.get('window').width
// export default function App() {
//   const [text, setText] = useState("este e un valor por defecto");
//   const [submit, setSubmit] = useState("");

//   return (
//     <View style={styles.container}>
//       <Text>Texto: {submit}</Text>
//       <TextInput
//         style={styles.input}
//         placeholder="escribe aqui"
//         onChangeText={(t) => setText(t)}
//         defaultValue={text}
//       />
//       <TouchableOpacity
//         style={styles.buttons}
//         onPress={() => {
//           setSubmit(text);
//           alert("texto enviado con exito");
//         }}
//       >
//         <View style={styles.view}>
//           <Text>Aceptar</Text>
//         </View>
//       </TouchableOpacity>
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input: {
//     //backgroundColor:'#eee',
//     height: 40,
//     width: "100%",
//     borderBottomColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   view: {
//     height: 40,
//     width: 300,
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   buttons: {
//     backgroundColor: "#eee",
//   },
// });
//*****************>(botones para android 4 ) aqui se implementa un boton cuya cualidad mas impiortante es que cuando se presiona no hace ningun gesto de feedback para el usuario, es util cuando se quiere dar uma interaccion custom a cada uno de los botones pero no es recomendable, el nombre del boton es: TouchableWithoutFeedback
// import React, { useState } from "react";
// import { StatusBar } from "expo-status-bar";
// import {
//   StyleSheet,
//   Text,
//   View,
//   TextInput,
//   Dimensions,
//   TouchableWithoutFeedback,
// } from "react-native";
// //const width = Dimensions.get('window').width
// export default function App() {
//   const [text, setText] = useState("este e un valor por defecto");
//   const [submit, setSubmit] = useState("");

//   return (
//     <View style={styles.container}>
//       <Text>Texto: {submit}</Text>
//       <TextInput
//         style={styles.input}
//         placeholder="escribe aqui"
//         onChangeText={(t) => setText(t)}
//         defaultValue={text}
//       />
//       <TouchableWithoutFeedback
//         style={styles.buttons}
//         onPress={() => {
//           setSubmit(text);
//           alert("texto enviado con exito");
//         }}
//       >
//         <View style={styles.view}>
//           <Text>Aceptar</Text>
//         </View>
//       </TouchableWithoutFeedback>
//       <StatusBar style="auto" />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input: {
//     //backgroundColor:'#eee',
//     height: 40,
//     width: "100%",
//     borderBottomColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   view: {
//     height: 40,
//     width: 300,
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   buttons: {
//     backgroundColor: "#eee",
//   },
// });
//*****************>(scrollView) aqui se implemento el scrollView, se suaron muchos componentes de texto precisamente para rellenar un espacio amplo de la pantalla y ver el funcionamiento del scrollView, ademas de esto se le asigno un style para que este ocuopara todo el hancho de la pantala del dispositivo en uso.
//NOTA: EL ScrollView TIENE UN PROBLEMA, EL POR DEFECTO TRATA TE MOSTRAR TODO EL CONTENIDO DE GOLPE SI NOSOTROS TENEMOS UNA LISTA DE 10 MIL ITEMS ESTO CLARAMENTE VA A AFECTAR EL RENDIMIENTO DE LA APLICACION, DEBEMOS DE APLICAR ALGUNA PAGINACION O UN TIPO DE CONTROL PARA EL SCRILL View.
// import React, { useState } from "react";
// import { StatusBar } from "expo-status-bar";
// import {
//   StyleSheet,
//   Text,
//   View,
//   TextInput,
//   Dimensions,
//   TouchableWithoutFeedback,
//   ScrollView,
// } from "react-native";
// //const width = Dimensions.get('window').width
// export default function App() {
//   const [text, setText] = useState("este e un valor por defecto");
//   const [submit, setSubmit] = useState("");

//   return (
//     <View style={styles.container}>
//       <ScrollView style={styles.scrollView}>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <Text>Texto: {submit}</Text>
//         <TextInput
//           style={styles.input}
//           placeholder="escribe aqui"
//           onChangeText={(t) => setText(t)}
//           defaultValue={text}
//         />
//         <TouchableWithoutFeedback
//           style={styles.buttons}
//           onPress={() => {
//             setSubmit(text);
//             alert("texto enviado con exito");
//           }}
//         >
//           <View style={styles.view}>
//             <Text>Aceptar</Text>
//           </View>
//         </TouchableWithoutFeedback>
//         <StatusBar style="auto" />
//       </ScrollView>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   input: {
//     //backgroundColor:'#eee',
//     height: 40,
//     width: "100%",
//     borderBottomColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   view: {
//     height: 40,
//     width: 300,
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   buttons: {
//     backgroundColor: "#eee",
//   },
//   scrollView: {
//     width: Dimensions.get("window").width,
//   },
// });
//*********************> esta es una manera de usar el componente FlatList creamos un objeto llamado data, creamos una funcion que renderiza cada uno de los items de los objetos en un componente view y ademas de esto tenemos el componente flatlist que renderiza cada uno de estos componentes view creados
// import React from "react";
// import { View, Image, StyleSheet, FlatList } from "react-native";

// export default function App() {
//   const data = [
//     { id: "1", image: require("./assets/tomy1.jpeg") },
//     { id: "2", image: require("./assets/tomy2.jpeg") },
//     { id: "3", image: require("./assets/tomy3.jpeg") },
//     { id: "4", image: require("./assets/tomy1.jpeg") },
//     { id: "5", image: require("./assets/tomy2.jpeg") },
//     { id: "6", image: require("./assets/tomy3.jpeg") },
//     { id: "7", image: require("./assets/tomy2.jpeg") },
//     { id: "8", image: require("./assets/tomy3.jpeg") },
//     { id: "9", image: require("./assets/tomy1.jpeg") },
//     { id: "10", image: require("./assets/tomy2.jpeg") },
//     { id: "11", image: require("./assets/tomy3.jpeg") }
//   ];

//   const renderItem = ({ item }) => (
//     <View style={styles.item}>
//       <Image source={item.image} style={styles.image} />
//     </View>
//   );

//   return (
//     <View style={styles.container}>
//       <FlatList
//         data={data}
//         renderItem={renderItem}
//         keyExtractor={(item) => item.id}
//         horizontal={false} // Esto hace que la lista sea horizontal
//       />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "center",
//     justifyContent: "center",
//   },
//   item: {
//     margin: 10,
//   },
//   image: {
//     width: 200, // ajusta el tamaño según tus necesidades
//     height: 400, // ajusta el tamaño según tus necesidades
//     resizeMode: "cover",
//     borderRadius: 10, // ajusta según tus necesidades
//   },
// });
//*********************>esta es la manera mas basica deimplementar una Flatlist donde tenemos un ubjeto que tiene dos propiedades un identificador y un nombre en la propiedad render item, lo que se esta especificando es que tome el obejeto completo y que desestructure a medida que se va renderizando el objeto.
// import React, { useState } from "react";
// import { StatusBar } from "expo-status-bar";
// import {
//   StyleSheet,
//   Text,
//   View,
//   ScrollView,
//   FlatList,
// } from "react-native";
// //const width = Dimensions.get('window').width
// export default function App() {
//   return (
//     <View style={styles.container}>
//       <FlatList
//       data={[
//         {Key:'1', name: "Andres"},
//         {Key:'2', name: "Felipe"},
//         {Key:'3', name: "Valencia"},
//         {Key:'4', name: "Lopez"},
//       ]}
//       renderItem={({item}) => <Text style={styles.item}>{item.Key} = {item.name}</Text>}
//       />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "strecht",
//     justifyContent: "center",
//     alignContent:"center",
//     paddingTop:22
//   },
//   item:{
//     padding:10,
//     paddingEnd:10,
//     fontSize:20,
//     height:50,
//     borderColor:'#ccc',
//     borderBottomWidth:1,
//     alignItems: "center",
//     justifyContent: "center",
//   }
// });
//***********************>En resumen, este código crea una aplicación React Native que utiliza SectionList para renderizar una lista de secciones, donde cada sección tiene un título y una lista de elementos asociados. Los estilos están definidos en el objeto styles usando StyleSheet.create.
/*El componente SectionList en React Native tiene dos propiedades que te permiten renderizar los títulos de cada sección y el contenido de cada elemento de la lista:
renderSectionHeader: Esta propiedad acepta una función que toma la información de una sección y devuelve un componente que sirve como el encabezado de esa sección. En el código proporcionado, esta función se utiliza para renderizar el título de cada sección como un componente Text con el estilo styles.sectionHeader.

jsx
Copy code
renderSectionHeader={({ section }) => (
  <Text style={styles.sectionHeader}>{section.title}</Text>
)}
En esta función, section es un objeto que contiene información sobre la sección actual, y section.title se refiere al título de esa sección.

renderItem: Esta propiedad acepta una función que toma la información de un elemento de la lista y devuelve un componente que representa ese elemento. En el código proporcionado, esta función se utiliza para renderizar el contenido de cada elemento como un componente Text con el estilo styles.item.

jsx
Copy code
renderItem={({ item }) => <Text style={styles.item}>{item.name}</Text>}
Al igual que en renderSectionHeader, item es un objeto que contiene información sobre el elemento actual, y item.name se refiere al contenido que se mostrará.*/
// import React from "react";
// import { StatusBar } from "expo-status-bar";
// import { StyleSheet, Text, View, SectionList } from "react-native";

// export default function App() {
//   return (
//     <View style={styles.container}>
//       <SectionList
//         sections={[
//           {
//             title: 'Grupo1',
//             data: [
//               { key: '1', name: 'Andres' },
//               { key: '2', name: 'Felipe' }
//             ]
//           },
//           {
//             title: 'Grupo2',
//             data: [
//               { key: '3', name: 'Valencia' },
//               { key: '4', name: 'Lopez' }
//             ]
//           },
//           {
//             title: 'Grupo3',
//             data: [
//               { key: '5', name: 'Juan' },
//               { key: '6', name: 'Manuel' }
//             ]
//           },
//           {
//             title: 'Grupo4',
//             data: [
//               { key: '7', name: 'Valencia' },
//               { key: '8', name: 'Lopez' }
//             ]
//           }
//         ]}
//         renderItem={({ item }) => <Text style={styles.item}>{item.name}</Text>}
//         renderSectionHeader={({ section }) => (
//           <Text style={styles.sectionHeader}>{section.title}</Text>
//         )}
//         keyExtractor={(item) => item.key}
//       />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   },
//   item: {
//     padding: 10,
//     fontSize: 22,
//     height: 44,
//     borderColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   sectionHeader: {
//     paddingTop: 2,
//     paddingLeft: 10,
//     paddingRight: 10,
//     paddingBottom: 2,
//     fontSize: 16,
//     fontWeight: 'bold',
//     backgroundColor: "#efefef",
//   },
// });
//***********************>como podemos traer datos desde un servidor y mostrarlos
/*Este código es una aplicación React Native que utiliza useState, useEffect, y FlatList para consumir una API y renderizar la lista de usuarios obtenida. 
Este código es una aplicación React Native que utiliza `useState`, `useEffect`, y `FlatList` para consumir una API y renderizar la lista de usuarios obtenida. Aquí está una descripción detallada y concisa:

1. **`useState` y `useEffect`:**
   - `useState` es un gancho de React que permite añadir estado a componentes funcionales. En este caso, `users` almacena la lista de usuarios y `loading` indica si la aplicación está en el estado de carga.
   - `useEffect` es otro gancho de React que se utiliza para ejecutar efectos secundarios en componentes funcionales. En este caso, se utiliza para realizar la llamada a la API cuando el componente se monta (`[]` en el segundo parámetro significa que solo se ejecuta una vez).

2. **`fetch` y `then`:**
   - `fetch` es una función nativa de JavaScript que se utiliza para realizar solicitudes HTTP. En este caso, se usa para obtener datos de la API `https://jsonplaceholder.typicode.com/users`.
   - `then` se utiliza para manejar la respuesta de la solicitud. En este caso, se encadena con dos funciones de flecha. La primera convierte la respuesta a formato JSON, y la segunda actualiza el estado `users` con los datos obtenidos y establece `loading` en `false` para indicar que la carga ha finalizado.

3. **Renderizado condicional durante la carga:**
   - Mientras `loading` es `true`, se renderiza un mensaje de carga en el componente `<View style={styles.center}>`. Una vez que los datos se han cargado (`loading` es `false`), se renderiza la lista de usuarios.

4. **`FlatList`:**
   - `FlatList` es un componente de React Native que renderiza una lista de elementos de manera eficiente. En este caso, se utiliza para renderizar la lista de usuarios. La propiedad `data` recibe la lista de usuarios, `renderItem` define cómo se renderiza cada elemento de la lista, y `keyExtractor` especifica cómo se extraen las claves únicas de los elementos.

5. **Estilos:**
   - Se definen estilos básicos para el contenedor principal (`container`), los elementos de la lista (`item`), y el mensaje de carga centrado (`center`).

En resumen, este código utiliza el estado local (`useState`), realiza una solicitud a una API (`fetch` y `then`), maneja el ciclo de vida del componente (`useEffect`), y utiliza `FlatList` para renderizar eficientemente una lista de usuarios en una aplicación React Native.
*/
// import React, { useState, useEffect } from "react";
// import { StatusBar } from "expo-status-bar";
// import { StyleSheet, Text, View, FlatList } from "react-native";

// export default function App() {
//   const [users, setUsers] = useState([])
//   const [loading, setloading] = useState(true)

//   useEffect(() => {
//     fetch('https://jsonplaceholder.typicode.com/users')
//       .then((response) => { return response.json() })
//       .then((data) => { setUsers(data); setloading(false) })
//   }, [])
//   if (loading) {
//     return (<View style={styles.center}>
//       <Text>Cargando por favor espere...</Text>
//     </View>)
//   }
//   return (
//     <View style={styles.container}>
//       <FlatList data={users} renderItem={({item})=> <Text style={styles.item}>{item.name}</Text>} keyExtractor={item=>String(item.id)}></FlatList>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   },
//   item: {
//     padding: 10,
//     fontSize: 18,
//     height: 44,
//     borderColor: "#ccc",
//     borderBottomWidth: 1,
//   },
//   center: {
//     flex: 1,
//     alignItems: "center",
//     justifyContent: "center"
//   }
// });
//***********************>En resumen, este código muestra un indicador de actividad en el centro de la pantalla con un fondo blanco y un espacio de relleno en la parte superior. Este tipo de componente es útil cuando se espera la carga de datos o se realiza una tarea asíncrona, proporcionando retroalimentación visual al usuario.
/*ActivityIndicator Component:

Este componente se importa desde react-native y se utiliza para mostrar un indicador de actividad (carga) en la interfaz de usuario.
Tamaño y Color:

El ActivityIndicator recibe dos propiedades importantes: size y color.
size: Define el tamaño del indicador. En este caso, se establece en "small".
color: Define el color del indicador. Aquí se establece en "#0000f" (un tono de azul oscuro).
Contenedor:

El ActivityIndicator está contenido dentro de un View que tiene un estilo definido por styles.container.
styles.container se define usando StyleSheet.create y contiene estilos que afectan al contenedor (View).
flex: 1: Hace que el contenedor ocupe todo el espacio disponible en la pantalla.
backgroundColor: "#fff": Establece el color de fondo del contenedor en blanco.
alignItems: "stretch" y justifyContent: "center": Alinean y justifican los elementos hijos del contenedor.
paddingTop: 22: Agrega un espacio de relleno en la parte superior del contenedor. */

// import React from "react";
// import { StyleSheet, ActivityIndicator, View,  } from "react-native";

// export default function App() {  
//   return (
//     <View style={styles.container}>
//       <ActivityIndicator size={"small"} color="#0000f"></ActivityIndicator>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   }
// });
//***********************>Image Component:

// El componente Image se importa desde react-native y se utiliza para mostrar imágenes.
// Imágenes:

// Hay dos imágenes en este componente:
// La primera imagen se carga desde un archivo local usando require. La ruta del archivo es relativa a la ubicación del componente actual y es '../HolaMundo/assets/tomy1.jpeg'.
// La segunda imagen se carga desde una URL remota utilizando source={{uri:'http://placekitten.com/200/200'}}.
// Estilos:

// Se utiliza un componente View como contenedor principal con el estilo definido por styles.container.
// flex: 1: Hace que el contenedor ocupe todo el espacio disponible en la pantalla.
// backgroundColor: "#fff": Establece el color de fondo del contenedor en blanco.
// alignItems: "stretch" y justifyContent: "center": Alinean y justifican los elementos hijos del contenedor.
// paddingTop: 22: Agrega un espacio de relleno en la parte superior del contenedor.
// Estilo de Imágenes:

// Las imágenes tienen un estilo común styles.photo que establece la altura y el ancho de las imágenes en 200 unidades.
// En resumen, este componente muestra dos imágenes, una desde un archivo local y otra desde una URL remota, dentro de un contenedor que ocupa toda la pantalla y tiene ciertos estilos de presentación.
// import React from "react";
// import { StyleSheet, Image, View,  } from "react-native";

// export default function App() {  
//   return (
//     <View style={styles.container}>      
//       <Image style={styles.photo} source={require('../HolaMundo/assets/tomy1.jpeg')}></Image>
//       <Image style={styles.photo} source={{uri:'http://placekitten.com/200/200'}}></Image>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   photo: {
//     height: 200,
//     width: 200
//   },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   }
// });
//***********************>ImageBackground Component:

// En lugar de utilizar el componente Image directamente, este código utiliza ImageBackground, que es un componente de React Native diseñado específicamente para mostrar una imagen de fondo.
// Imagen de Fondo:

// La imagen de fondo se carga desde un archivo local usando require. La ruta del archivo es relativa a la ubicación del componente actual y es '../HolaMundo/assets/tomy1.jpeg'.
// Texto superpuesto:

// Se utiliza un componente Text para mostrar el mensaje "Esto es un ejemplo de que se puede tener una imagen como fondo". Este texto tiene un estilo definido por styles.text.
// color: 'white': Establece el color del texto en blanco.
// fontSize: 28: Establece el tamaño de fuente del texto en 28 unidades.
// Estilos:

// Se utiliza un componente View como contenedor principal con el estilo definido por styles.container.
// flex: 1: Hace que el contenedor ocupe todo el espacio disponible en la pantalla.
// backgroundColor: "#fff": Establece el color de fondo del contenedor en blanco.
// alignItems: "stretch" y justifyContent: "center": Alinean y justifican los elementos hijos del contenedor.
// paddingTop: 22: Agrega un espacio de relleno en la parte superior del contenedor.
// Estilo de la Imagen de Fondo:

// La imagen de fondo tiene un estilo styles.photo que establece la altura y el ancho de la imagen en 200 unidades.
// En resumen, este componente muestra una imagen como fondo y coloca un mensaje de texto sobre la imagen de fondo, todo dentro de un contenedor con ciertos estilos de presentación.
// import React from "react";
// import { StyleSheet,Text, ImageBackground, View,  } from "react-native";

// export default function App() {  
//   return (
//     <View style={styles.container}>      
//       <ImageBackground style={styles.photo} source={require('../HolaMundo/assets/tomy1.jpeg')}>
//         <Text style={styles.text}>Esto es un ejemplo de que se puede tener una imgane como fondo </Text>
//       </ImageBackground>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   photo: {
//     height: 200,
//     width: 200
//   },
//   text:{color:'white', fontSize: 28},
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   }
// });
//***********************>Modales
/* Importaciones: Se importan varios componentes y funciones de la biblioteca react-native. Entre ellos, useState para manejar el estado en componentes de función, Modal para crear un componente modal, View para estructurar la interfaz de usuario, Button para crear botones y Text para mostrar texto.

Función App:

Se define un componente funcional llamado App.

Se utiliza el hook useState para crear una variable de estado modal con su función de actualización setModal. La variable de estado controla si el modal está visible o no.

El componente principal (<View style={styles.container}>) contiene:

Un modal que se muestra o se oculta según el estado de modal.

El contenido del modal (<View style={styles.content}>) que contiene un texto y un botón para cerrar el modal.

Varias etiquetas <Text> que están fuera del modal y se muestran en la pantalla principal.

Un botón que, al ser presionado, cambia el estado de modal para abrir o cerrar el modal.

Estilos (styles):

Se definen algunos estilos utilizando StyleSheet.create para el modal, el contenido del modal y el contenedor principal.
Los estilos definen propiedades como color de fondo, alineación, márgenes, etc.
En resumen, este código muestra una aplicación React Native con un botón que, al ser presionado, abre un modal con un texto y un botón para cerrarlo. La pantalla principal contiene algunas etiquetas de texto y un botón para abrir el modal.
 */
// import React, { useState } from "react";
// import { StyleSheet, Text, Modal, View, Button } from "react-native";

// export default function App() {
//   const [modal, setModal] = useState(false)
//   return (
//     <View style={styles.container}>
//       <Modal animationType="slide" transparent="false" visible={modal}>
//         <View style={styles.center}>
//           <View style={styles.content}>
//             <Text>soy un Modal</Text>
//             <Button title="cerrar Modal" onPress={()=>setModal(!modal)}></Button>
//           </View>
//         </View>
//       </Modal>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Text> No soy el Modal</Text>
//       <Button title="Abrir el Modal" onPress={()=>setModal(!modal)}></Button>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   content: {
//     backgroundColor:"#eeee",
//     flex:1,
//     alignItems: "center",
//     justifyContent: "center",
//     margin: 25,

//   },
//   text: { color: 'white', fontSize: 28 },
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   },
//   center: {
//     flex:1,
//     alignItems: "stretch",
//     justifyContent: "center",
//     backgroundColor: "rgba(0,0,0,0.3)"
//   }
// });
//***********************>Alertas
/*Este código React Native muestra un botón que, cuando se presiona, activa una alerta (cuadro de diálogo) con un título, un mensaje y dos botones: "Cancelar" y "Aceptar". Aquí está el análisis del código:

Importaciones:

React, useState: Importa React y el hook useState para manejar el estado en componentes de función.
StyleSheet, Text, Alert, View, Button: Importa componentes y funciones de React Native para estilos, texto, alertas, vistas y botones respectivamente.
Función crearDialogo:

Es una función que usa Alert.alert para mostrar una alerta con un título, un mensaje y dos botones.
La alerta tiene dos botones, "Cancelar" y "Aceptar", y se define una acción para ejecutar cuando se presiona el botón "Aceptar". En este caso, se imprime un mensaje en la consola.
Componente App:

Define un componente funcional llamado App.
El componente devuelve una vista (<View>) que contiene un botón (<Button>) con el título "Abrir dialogo".
Cuando el botón se presiona, se llama a la función crearDialogo, que muestra la alerta con las opciones "Cancelar" y "Aceptar".
Estilos (styles):

Define un estilo para el contenedor principal (container), que establece el fondo, la alineación y el espacio interior.
En resumen, este código representa una aplicación React Native simple que utiliza el componente Alert para mostrar un cuadro de diálogo cuando se presiona un botón. El cuadro de diálogo tiene un título, un mensaje y dos botones con acciones asociadas.*/
// import React, { useState } from "react";
// import { StyleSheet, Text, Alert, View, Button } from "react-native";
// const crearDialogo = () => Alert.alert(
//   'Titulo',
//   'Este es un mensaje de alerta',
//   [
//     { text: "Cancelar", onPress: () => { }, style: "cancel" },
//     { text: "Aceptar", onPress: () => { console.log("boton presionado") }, style: "accept" }
//   ],
//   { cancelable: false }
// )
// export default function App() {
//   return (
//     <View style={styles.container}>
//       <Button title="Abrir dialogo" onPress={crearDialogo}></Button>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   },

// });
//***********************>Geolocalizacion
/*
El código proporcionado es una aplicación React Native que utiliza la biblioteca expo-location para acceder a la ubicación del dispositivo y react-native-maps para mostrar esa ubicación en un mapa junto con un marcador. Aquí está una explicación más detallada del código:

Importaciones:
Se importan módulos y componentes necesarios, como React, React Native, Expo, y componentes relacionados con mapas.

Componente Funcional App:
El componente funcional App hace uso del estado (locacion y setLocation) y del hook useEffect. La función buscalocation solicita permisos de ubicación y obtiene la posición actual del dispositivo. Si los permisos no se otorgan, se muestra una alerta. La ubicación se almacena en el estado locacion. useEffect se utiliza para ejecutar buscalocation una vez cuando el componente se monta.

Renderizado del Mapa:
Se renderiza una vista (View) que contiene un componente MapView de react-native-maps. La propiedad initialRegion del mapa se establece con las coordenadas de la ubicación actual obtenida, o se establece en (0, 0) si la ubicación aún no se ha obtenido. Si la ubicación está disponible, se muestra un marcador (Marker) en el mapa con las coordenadas de la ubicación actual.

Estilos (styles):
Se definen estilos para el contenedor principal (container) y el mapa (map) utilizando StyleSheet.create.

En resumen, el código crea una aplicación que muestra la ubicación actual del dispositivo en un mapa de React Native.*/
// import React, { useEffect, useState } from "react";
// import { Alert, Dimensions, StyleSheet, Text, View } from "react-native";
// import * as Location from 'expo-location';
// import Constants from 'expo-constants';
// import MapView, { Marker } from 'react-native-maps';

// export default function App() {
//   const [locacion, setLocation] = useState({})

//   const buscalocation = async () => {
//     const { status } = await Location.requestForegroundPermissionsAsync()
//     if (status !== 'granted') {
//       return Alert.alert('No tenemos los permisos necesarios para acceder a la ubicación')
//     }
//     const location = await Location.getCurrentPositionAsync({})
//     setLocation(location)
//   }

//   useEffect(() => {
//     buscalocation()
//   }, [])

//   return (
//     <View style={styles.container}>
//       <MapView
//         style={styles.map}
//         initialRegion={{
//           latitude: locacion.coords?.latitude || 0,
//           longitude: locacion.coords?.longitude || 0,
//           latitudeDelta: 0.0922,
//           longitudeDelta: 0.0421,
//         }}
//       >
//         {locacion.coords
//           ? <Marker coordinate={locacion.coords} title="Mi Ubicación" description="Ubicación actual"></Marker>
//           : null
//         }
//       </MapView>
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#fff",
//     alignItems: "stretch",
//     justifyContent: "center",
//     paddingTop: 22,
//   },
//   map: {
//     width: Dimensions.get('window').width,
//     height: Dimensions.get('window').height,
//   }
// });
//***********************>Camara
/*Este código es una aplicación React Native que utiliza la biblioteca expo-camera para acceder a la cámara del dispositivo y permite al usuario cambiar entre la cámara frontal y la trasera. Aquí tienes una explicación sin el código:

Permisos de Cámara:

La aplicación solicita permisos de cámara utilizando Camera.requestCameraPermissionsAsync() y actualiza el estado permisos según si los permisos son otorgados ('granted') o no.
Inicio del Proceso de Permisos:

En el hook useEffect, la función getPermisos se ejecuta al iniciar la aplicación para obtener los permisos de la cámara.
Manejo de Estado de Permisos:

Si permisos es null, se muestra un mensaje de carga.
Si permisos es false, se muestra un botón que permite al usuario solicitar permisos.
Renderizado de la Cámara:

Si los permisos son otorgados (permisos === true), se muestra el componente Camera de expo-camera.
El tipo de cámara (front o back) se controla mediante el estado tipo.
Se muestra un botón que permite al usuario cambiar entre la cámara frontal y trasera.
Estilos:

Los estilos (styles) definen la apariencia del contenedor principal (container) y la cámara (camera).
En resumen, la aplicación verifica y solicita permisos de cámara, muestra un mensaje de carga o un botón según el estado de los permisos, y permite al usuario ver la transmisión en vivo de la cámara, cambiando entre las cámaras frontal y trasera mediante un botón. */
import React, { useEffect, useState } from "react";
import { Alert, Button, StyleSheet, Text, View } from "react-native";
import MapView, { Marker } from 'react-native-maps';
import {Camera} from 'expo-camera'

export default function App() {
  const [permisos, setPermisos] = useState(null)
  const [tipo, setTipo] = useState(Camera.Constants.Type.back)


  const getPermisos = async()=>{
    const {status} = await Camera.requestCameraPermissionsAsync();
    setPermisos(status == 'granted')
    console.log(status)
  }
  useEffect(()=>{
    getPermisos()
  })

  if(permisos === null){
    return <View><Text>Cargando...</Text></View>
  }
  if (permisos === false){
    return <View> <Button title="Solicitar permiso" onPress={getPermisos}/> </View>
  }  
  return (
    <View style={styles.container}>
      <Camera style={styles.camera} type={tipo}>
        <Button 
        title="voltear"
        onPress={()=>{
          const{front, back} = Camera.Constants.Type
          const nuevoTio = tipo ===  back ? front : back
          setTipo(nuevoTio)
        }}
/>
      </Camera>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "stretch",
    justifyContent: "center",
    paddingTop: 22,
  },
  camera:{
    flex:1,
  }
});