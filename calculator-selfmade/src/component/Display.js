import React from "react"
import "./Display.css"
import "./ButtonPanel"
import ButtonPanel from "./ButtonPanel";

class Display extends React.Component {

    render(){
        return(
            <div class = "component-display">
                <div className = "component-inside-display">0</div>
            </div>
        );
    }
}

export default Display;
