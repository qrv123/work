import React from "react";
import PropTypes from "prop-types";
import "./ButtonPanel.css";
import Button from "./Button";

class ButtonPanel extends React.Component {

    render(){
        return(
            <div className = "component-button-panel">
                <div>
                    <Button name = "7" />
                    <Button name = "8" />
                    <Button name = "9" />
                    <Button name = "x" />
                </div>
                <div>
                    <Button name = "6" />
                    <Button name = "5" />
                    <Button name = "4" />
                    <Button name = "+" />
                </div>
                <div>
                    <Button name = "3" />
                    <Button name = "2" />
                    <Button name = "1" />
                    <Button name = "-" />
                </div>
            </div>
            
        );
    }
}

export default ButtonPanel;