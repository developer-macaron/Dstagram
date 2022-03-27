/* src/layouts/Main/Main.js */
/* React */
import React from 'react';
import PropTypes from 'prop-types';

/* Styled */
import styled, { createGlobalStyle } from 'styled-components';

/* Sub Components */
import Header from './Header';
import {CContainer} from "@coreui/react";

/* Main Compoent */
const MainLayout = (props: {
    children: React.ReactNode
}) => {
    /* Renderer */
    return (
        <CContainer fluid>
            <Header />
            <main>
            { props.children }
            </main>
        </CContainer>
    );
}

/* Exports */
export default MainLayout;