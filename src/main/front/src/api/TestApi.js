function test(url: string, params?: Record<string, string>, callback?: () => void) {
    const queryParam = new URLSearchParams(params).toString();
    return fetch(url + "?" + queryParam, {
        method: 'GET'
        // , headers: {
        //     Accept: 'application/json',
        //     'Content-Type': 'application/json'
        // }
    })
}

export const TestApi = { test };