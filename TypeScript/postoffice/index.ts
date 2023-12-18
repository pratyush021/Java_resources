function api<T>(url: string): Promise<T> {
     return fetch(url) 
        .then(res => {
            if(!res.ok) {
                throw new Error(res.statusText)
                }
                return res.json() as Promise<T>
        })
}


api("http://localhost:8080"); 

