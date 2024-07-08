const base = {
    get() {
        return {
            url : "http://localhost:8080/springboote51e2/",
            name: "springboote51e2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboote51e2/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "实验室管理系统"
        } 
    }
}
export default base
