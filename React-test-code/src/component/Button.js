import React from "react";

import "./Button.css"

class Button extends React.Component {

    // constructor(){
    //     super();
    //     this.state = {
    //         text : "Initial text",
    //         bt: "asd"
    //     };
    // }

    state = {
        text : "Initial text",
            bt: "asd"
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

    click4 = () => {

        /*if (this.refs.textBox.value === {"a" || "b"}) {
            this.setState({text: "Blank Space"});
        }
        else {
            this.setState({text: this.refs.textBox.value})
        }*/

        (this.refs.textBox.value === "") ? this.setState({text:"BlankSpace"}) : this.setState({text: this.refs.textBox.value})

    }
    update = (e) => {
        this.setState({bt: this.refs.btalks.value});
    }

    render(){
        return(
            <div>
                {this.state.text}

                <h1><button className = "component-button" onClick = {this.click1}>Button without Param</button></h1>

                <h2><button onClick = {(a , b) => this.click2("Hello", "You")}>Button with 2 param</button></h2>

                <h3><button onClick = {(a) => this.click3("Initial has just been modified")}>Set state</button></h3>

                <input type="text" ref = "textBox" />

                <h4><button onClick = {this.click4}>Set Text Box</button></h4>

                <h5><input type = "text" ref = "btalks" onChange={this.update} />{this.state.bt}</h5>

                <h6><button onClick={this.click4.bind(this)}>Set State 2</button></h6>
            </div>
        );
    }
}

export default Button;