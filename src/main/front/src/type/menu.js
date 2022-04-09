import React from 'react';

import Home from "pages/Home.js";
import Login from "pages/Login.js";
import Timeline from "pages/Timeline.js";
import Post from "pages/Post.js";

const ROUTE = {
    LOGIN: {
        url: '/login',
        component: <Login />,
    },
    TIMELINE: {
        url: '/timeline',
        component: <Timeline />,
    },
    POST: {
        url: '/post',
        component: <Post />,
    },
    HOME: {
        url: '/home',
        component:  <Home/>,
    },
}

export {
    ROUTE,
};

