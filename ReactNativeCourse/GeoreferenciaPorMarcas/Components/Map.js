import React from "react";
import MapView  from 'react-native-maps';
import { StyleSheet, Dimensions } from 'react-native';

export default ({onLongPress}) => {
    // Coordenadas de ejemplo (puedes ajustarlas según tu necesidad)
    const initialRegion = {
        latitude: 37.78825,
        longitude: -122.4324,
        latitudeDelta: 0.0922,
        longitudeDelta: 0.0421,
    };

    return (
        <MapView
            style={styles.map}
            initialRegion={initialRegion} // Agrega esta línea para proporcionar una región inicial al mapa
            onLongPress={onLongPress}
        />
    )
}

const styles = StyleSheet.create({
    map: {
        height: Dimensions.get('window').height -150,
        width: Dimensions.get('window').width,
    },
})
