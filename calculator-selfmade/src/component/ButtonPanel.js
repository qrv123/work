import React from "react";
import PropTypes from "prop-types";
import "./ButtonPanel.css";
import Button from "./Button";

class ButtonPanel extends React.Component {

    render(){
        return(
            <div className = "component-button-panel">
                <div>
                    <Button name = "0" />
                    <Button name = "1" />
                    <Button name = "2" />
                    <Button name = "3" />
                </div>
                <div>
                    <Button name = "4" />
                    <Button name = "5" />
                    <Button name = "6" />
                    <Button name = "7" />
                </div>
                <div>
                    <Button name = "8" />
                    <Button name = "9" />
                    <Button name = "10" />
                    <Button name = "11" />
                </div>
            </div>
            
        );
    }
}

export default ButtonPanel;