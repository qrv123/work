import React from "react";

import "./Button.css"

class Button extends React.Component {

    constructor(){
        super();
        this.state = {
            text : "Initial text"
        };
    }

    click1 = () => {
        alert('Hello')
    }

    click2 = (a,b) => {
        alert(a + " " + b + " MOTHER F*CKER")
    }

    click3 = (text) => {
        this.setState({text: text})
    }

    click4 = (e) => {
        this.setState({text: this.refs.textBox.value});
    }

    render(){
        return(
            <div>
                {this.state.text}

                <h1><button onClick = {this.click1}>Button without Param</button></h1>

                <h2><button onClick = {(a , b) => this.click2("Hello", "You")}>Button with 2 param</button></h2>

                <h3><button onClick = {(a) => this.click3("Initial has just been modified")}>Set state</button></h3>

                <input ref = "textBox" type="text" />

                <h4><button onClick = {(e) =>{this.click4;}}>Set Text Box</button></h4>
            </div>
        );
    }
}

export default Button;