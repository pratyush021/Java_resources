 
var args = process.argv.slice(2);

console.log(args) 
function api(url) {
    return fetch(url)
        .then(res => {
        if (!res.ok) {
            throw new Error(res.statusText);
        }
        return res.json();
    });
}

api("http://localhost:8080") 
