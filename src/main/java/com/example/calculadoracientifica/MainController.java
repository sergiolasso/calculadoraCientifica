package com.example.calculadoracientifica;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import org.controlsfx.control.action.AnnotatedAction;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, EventHandler<ActionEvent> {

    @FXML
    private GridPane bloquePrincipal;

    @FXML
    private BorderPane bordeGeneral;

    @FXML
    private Button boton0;

    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;

    @FXML
    private Button boton4;

    @FXML
    private Button boton5;

    @FXML
    private Button boton6;

    @FXML
    private Button boton7;

    @FXML
    private Button boton8;

    @FXML
    private Button boton9;

    @FXML
    private Button botonCBorrar;

    @FXML
    private Button botonCientifica;

    @FXML
    private Button botonCos;

    @FXML
    private Button botonDividir;

    @FXML
    private Button botonIgual;

    @FXML
    private Button botonLog;

    @FXML
    private Button botonMultiplicar;

    @FXML
    private Button botonRegistro;

    @FXML
    private Button botonRestar;

    @FXML
    private Button botonSen;

    @FXML
    private Button botonSumar;

    @FXML
    private Button botonTan;

    @FXML
    private Button botonX4;

    @FXML
    private GridPane cientifica;

    @FXML
    private Pane ladoCientifica;

    @FXML
    private Pane ladoRegistro;

    @FXML
    private GridPane parteArriba;

    @FXML
    private GridPane parteDerecha;

    @FXML
    private TextField textoEntrada;

    @FXML
    private TextArea textoHistorico;

    private String op1 = "";
    private String op2 = "";
    private double resultado = 0;
    private String operando = "";
    private boolean operacionFuncionando = false;

    @Override
    public void handle(ActionEvent actionEvent) {

            escribirTextArea(actionEvent);
            botonesExpansionaes(actionEvent);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        inicializarBotonesCentral();
        inicializarBotonesCienfitifica();
        textoEntrada.setText("");
        botonCientifica.setOnAction(this);
        botonRegistro.setOnAction(this);
        bordeGeneral.setLeft(null);
        bordeGeneral.setRight(null);

    }

    //Inicializacion de botones por GetChildren
    public void inicializarBotonesCentral(){

        for (Node item: bloquePrincipal.getChildren()) {

            if(item instanceof Button){
                ((Button) item).setOnAction(this);
            }

        }

    }
    public void inicializarBotonesCienfitifica(){

        for (Node item: cientifica.getChildren()){

            if(item instanceof Button){
                ((Button) item).setOnAction(this);
            }

        }

    }

    public void escribirTextArea(ActionEvent actionEvent){
        if(actionEvent.getSource() == boton0){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton0.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton0.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton0.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton0.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton1){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton1.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton1.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton1.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton1.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton2){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton2.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton2.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton2.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton2.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton3){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton3.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton3.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton3.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton3.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton4){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton4.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton4.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton4.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton4.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton5){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton5.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton5.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton5.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton5.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton6){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton6.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton6.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton6.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton6.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton7){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton7.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton7.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton7.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton7.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton8){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton8.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton8.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton8.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton8.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == boton9){
            if(op1 == "" && !operacionFuncionando){
                op1 = boton9.getText();
                textoEntrada.setText(op1);
            } else if (op1 != "" && !operacionFuncionando) {
                op1 += boton9.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op1);
            } else if (operacionFuncionando && op2 == "") {
                op2 = boton9.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            } else if (operacionFuncionando && op2 != "") {
                op2 += boton9.getText();
                textoEntrada.setText("");
                textoEntrada.setText(op2);
            }
        } else if(actionEvent.getSource() == botonSumar){
            if(!operacionFuncionando){
                operando = "+";
                operacionFuncionando = true;
            } else{
                operando = "+";
            }
        } else if(actionEvent.getSource() == botonRestar){
            if(!operacionFuncionando){
                operando = "-";
                operacionFuncionando = true;
            } else{
                operando = "-";
            }
        } else if(actionEvent.getSource() == botonMultiplicar){
            if(!operacionFuncionando){
                operando = "*";
                operacionFuncionando = true;
            } else{
                operando = "*";
            }
        } else if(actionEvent.getSource() == botonDividir){
            if(!operacionFuncionando){
                operando = "/";
                operacionFuncionando = true;
            } else{
                operando = "/";
            }
        } else if(actionEvent.getSource() == botonIgual){
            funcionalidad(actionEvent);
        } else if(actionEvent.getSource() == botonCBorrar) {
            borrarTodo();
        } else if (actionEvent.getSource() == botonX4){
            operando = botonTan.getText();
            resultado = elevar4(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonLog){
            operando = botonLog.getText();
            resultado = logx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonSen) {
            operando = botonSen.getText();
            resultado = senx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonCos) {
            operando = botonCos.getText();
            resultado = conx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonTan) {
            operando = botonTan.getText();
            resultado = tanx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        }

    }


    public void botonesExpansionaes(ActionEvent actionEvent){

        if (actionEvent.getSource() == botonCientifica){
            if(bordeGeneral.getLeft() == null){
                bordeGeneral.setLeft(ladoCientifica);
            }else{
                bordeGeneral.setLeft(null);
            }

        } else if (actionEvent.getSource() == botonRegistro) {
            if(bordeGeneral.getRight() == null){
                bordeGeneral.setRight(ladoRegistro);
            }else{
                bordeGeneral.setRight(null);
            }
        }

    }

    public void funcionalidad(ActionEvent actionEvent){
        if(operando == "+"){
            if(op2 == ""){
                resultado = Double.parseDouble(op1);
            }else{
                resultado = sumar(Double.parseDouble(op1), Double.parseDouble(op2));
            }
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            segundaRonda(resultado);
        } else if (operando == "-") {
            if(op2 == ""){
                resultado = Double.parseDouble(op1);
            }else{
                resultado = restar(Double.parseDouble(op1), Double.parseDouble(op2));
            }
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            segundaRonda(resultado);
        } else if (operando == "*") {
            if(op2 == ""){
                resultado = Double.parseDouble(op1);
            }else{
                resultado = multiplicar(Double.parseDouble(op1), Double.parseDouble(op2));
            }
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            segundaRonda(resultado);
        } else if (operando == "/") {
            if(op2 == ""){
                resultado = Integer.parseInt(op1);
            } else {
                resultado = dividir(Double.parseDouble(op1), Double.parseDouble(op2));
            }
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            segundaRonda(resultado);
        } else if (actionEvent.getSource() == botonX4){
            operando = botonTan.getText();
            resultado = elevar4(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonLog){
            operando = botonLog.getText();
            resultado = logx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonSen) {
            operando = botonSen.getText();
            resultado = senx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonCos) {
            operando = botonCos.getText();
            resultado = conx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        } else if (actionEvent.getSource() == botonTan) {
            operando = botonTan.getText();
            resultado = tanx(Double.parseDouble(op1));
            textoEntrada.setText("");
            textoEntrada.setText(String.valueOf(resultado));
            anadirRegistro();
            op1 = String.valueOf(resultado);
            segundaRonda(Double.parseDouble(op1));
        }


    }

    //operaciones

    public double sumar(double op1, double op2){
        return op1 + op2;
    }

    public double restar(double op1, double op2){
        return op1 - op2;
    }

    public double multiplicar(double op1, double op2){return op1 * op2;}

    public double dividir(double op1, double op2){
        if(op2 == 0){
            return 0.0;
        }else{
            return op1 / op2;
        }
    }

    public double elevar4(double op1){return Math.pow(op1, 4);}

    public double logx(double op1){
        return Math.log(op1);
    }

    public double senx(double op1) {
        return Math.sin( Math.toRadians(op1));
    }

    public double conx(double op1){
        return Math.cos( Math.toRadians(op1));
    }

    public double tanx(double op1){ return Math.tan( Math.toRadians(op1)); }


    public void borrarTodo(){
        op1 = "";
        op2 = "";
        resultado = 0;
        operando = "";
        operacionFuncionando = false;
        textoEntrada.setText("");
    }

    public void segundaRonda(double num){
        op1 = String.valueOf(num);
        op2 = "";
        operando = "";
        operacionFuncionando = false;
        resultado = 0;
    }

    public void anadirRegistro(){
        if(op2 == ""){
            String frase = op1 + " " +  operando + " = " + resultado;
            textoHistorico.setText(textoHistorico.getText() + " \n" + frase);
        }else{
            String frase = op1 + " " +  operando + " " + op2 + " = " + resultado;
            textoHistorico.setText(textoHistorico.getText() + " \n" + frase);
        }
    }

    //solo para saber cuales son los valores mientras se esta operando
    public void comprobadorDeEstado(){
        System.out.println(op1);
        System.out.println(operando);
        System.out.println(op2);
        System.out.println(resultado);
        System.out.println(operacionFuncionando);
        textoEntrada.setText("");
    }



}
