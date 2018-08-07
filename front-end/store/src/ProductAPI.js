
const api = "http://localhost:8080"



export const getAllProducts = () =>
    fetch(`${api}/allProducts`)
        .then(response => response.json())
        .catch(err => console.log('error fetching data: ', err))


export const getProductByID = (productId) =>
    fetch(`${api}/productDescription?id=${productId}`)
        .then(res => res.json())
        .catch(err => console.log('error fetching product details: ', err))