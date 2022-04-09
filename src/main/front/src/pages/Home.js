import React, {useEffect, useState} from 'react';

const Home = () => {
    const [testString, setTestString] = useState([]);

    useEffect(() => {
        fetch('/api/test').then((res) => {
            return res.json();
        }).then((data) => {
            console.log(data);
            setTestString(data);
        })
    }, []);

    return (
        <div>
            홈
            <br/>
            {testString}
        </div>
    );
}

Home.propTypes = {};

export default Home;