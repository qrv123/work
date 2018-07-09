import React from "react"
import PropTypes from "prop-types";
import "./Button.css";

class Button extends React.Component {

    render(){

        return(
            <div className = "btn">
                <button >{this.props.name}</button>
            </div>
        );
    }
}

Button.propTypes = {
    name: PropTypes.string
}

export default Button;