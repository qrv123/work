import React from "react"
import PropTypes from "prop-types";
import "./Button.css";

class Button extends React.Component {

    render(){

        return(
            <div className = "component-button">
                <button onClick = {}>{this.props.name}</button>
            </div>
        );
    }
}

Button.propTypes = {
    name: PropTypes.string,
    clickHandler: PropTypes.func //Vì hàm xử lý sự kiện onClick là hàm mặc định của <button>, Nên khi tạo Button phải tạo hàm clickHandler này
}

export default Button;