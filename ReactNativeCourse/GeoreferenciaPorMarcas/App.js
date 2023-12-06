import React, { useState } from 'react';
import { StyleSheet, View, Text, Button, TouchableOpacity } from 'react-native';
import { Map, Modal, Panel, Input } from './Components';

export default function App() {
  const [puntos, setPuntos] = useState([])
  const [nombre, setNombre] = useState()
  const [temporales, setTemporales] = useState({})
  const [visibility, setVisibility] = useState(false)



  const handleLongPress = ({ nativeEvent }) => {
    setTemporales(nativeEvent.coordinate)
    setVisibility(true)
  }
  const SetNombre = text => {
    setNombre(text)
  }
  const handleSubmit = () => {
    const newPunto = { coordinate: temporales, name: nombre }
    setPuntos(puntos.concat(newPunto))
    setVisibility(false)
    setNombre('')
  }
  const handleCancel = () => {
    setVisibility(false)
    setNombre('')
  }
  console.log(puntos)
  return (
    <View style={styles.container}>
      <Map onLongPress={handleLongPress} />
      <Panel />
      <Modal visibility={visibility}>
        <View style={styles.modalTitle}>
          <Input style={styles.modalTitle} title="Nombre" placeholder="Nombre del punto" onChangeText={SetNombre}></Input>
        </View>
        <View style={styles.button}>
          <Button title='Aceptar' onPress={handleSubmit} />
        </View>
        <View style={styles.button}>
          <Button style={styles.button} title='Cancelar' onPress={handleCancel} />
        </View>
      </Modal>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'flex-start',
  },
  modalTitle: {
    marginBottom: 10,
    textAlign:'center'
  },
  modalButtons: {
    flexDirection: 'row',
    justifyContent: 'space-between',
  },
  button: { 
    marginTop: 2,   
    padding: 5,
    borderRadius: 4,
  },

});
