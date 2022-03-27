import React from 'react';
import '@coreui/coreui/dist/css/coreui.min.css'

const Header = () => {
    /* Renderer */
    return (
        <header className="header">
            <a className="header-brand" href="#">
                    header
            </a>
            <button className="header-toggler" type="button">
                <span className="header-toggler-icon"></span>
            </button>
            <ul className="header-nav mr-auto">
                <li className="nav-item active">
                    <a className="nav-link" href="#">Home <span className="visually-hidden">(current)</span></a>
                </li>
                <li className="nav-item">
                    <a className="nav-link" href="#">Link</a>
                </li>
                <li className="nav-item dropdown">
                    <a className="nav-link dropdown-toggle" href="#" id="headerDropdown" role="button"
                       data-coreui-toggle="dropdown" aria-expanded="false">
                        Dropdown
                    </a>
                    <div className="dropdown-menu" aria-labelledby="headerDropdown">
                        <a className="dropdown-item" href="#">Action</a>
                        <a className="dropdown-item" href="#">Another action</a>
                        <div className="dropdown-divider"></div>
                        <a className="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
                <li className="nav-item">
                    <a className="nav-link disabled" href="#" tabIndex="-1" aria-disabled="true">Disabled</a>
                </li>
            </ul>
        </header>
    );
}

/* Exports */
export default Header;