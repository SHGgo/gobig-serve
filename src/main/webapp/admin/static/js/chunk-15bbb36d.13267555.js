(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-15bbb36d"],{2017:function(n,t,e){"use strict";var s=e("b12d"),o=e.n(s);o.a},"2f1a":function(n,t,e){"use strict";var s=e("fa65"),o=e.n(s);o.a},"9ed6":function(n,t,e){"use strict";e.r(t);var s=function(){var n=this,t=n.$createElement,e=n._self._c||t;return e("div",{staticClass:"login-container"},[e("el-form",{ref:"loginForm",staticClass:"login-form",attrs:{model:n.loginForm,rules:n.loginRules,"auto-complete":"on","label-position":"left"}},[e("div",{staticClass:"title-container"},[e("h3",{staticClass:"title"},[n._v("欢 迎 回 来")])]),n._v(" "),e("el-form-item",{attrs:{prop:"adminAccount"}},[e("span",{staticClass:"svg-container"},[e("svg-icon",{attrs:{"icon-class":"user"}})],1),n._v(" "),e("el-input",{ref:"adminAccount",attrs:{placeholder:"账号",name:"adminAccount",type:"text",tabindex:"1","auto-complete":"on"},model:{value:n.loginForm.adminAccount,callback:function(t){n.$set(n.loginForm,"adminAccount",t)},expression:"loginForm.adminAccount"}})],1),n._v(" "),e("el-form-item",{attrs:{prop:"password"}},[e("span",{staticClass:"svg-container"},[e("svg-icon",{attrs:{"icon-class":"password"}})],1),n._v(" "),e("el-input",{key:n.passwordType,ref:"password",attrs:{type:n.passwordType,placeholder:"密码",name:"adminPassword",tabindex:"2","auto-complete":"on"},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&n._k(t.keyCode,"enter",13,t.key,"Enter")?null:n.handleLogin(t)}},model:{value:n.loginForm.adminPassword,callback:function(t){n.$set(n.loginForm,"adminPassword",t)},expression:"loginForm.adminPassword"}}),n._v(" "),e("span",{staticClass:"show-pwd",on:{click:n.showPwd}},[e("svg-icon",{attrs:{"icon-class":"password"===n.passwordType?"eye":"eye-open"}})],1)],1),n._v(" "),e("el-button",{staticStyle:{width:"100%","margin-bottom":"30px"},attrs:{loading:n.loading,type:"primary"},nativeOn:{click:function(t){return t.preventDefault(),n.handleLogin(t)}}},[n._v("Login")]),n._v(" "),e("div",{staticClass:"tips"},[e("span",{staticStyle:{"margin-right":"20px"}},[n._v("账号: admin")]),n._v(" "),e("span",[n._v("密码: 1234")])])],1)],1)},o=[],a={name:"Login",data:function(){return{loginForm:{adminAccount:"",adminPassword:""},loginRules:{adminAccount:[{required:!0,min:3,max:15,message:"长度在 3 到 15 个字符",trigger:"blur"}],adminPassword:[{required:!0,min:3,max:15,message:"长度在 3 到 15 个字符",trigger:"blur"}]},loading:!1,passwordType:"password",redirect:void 0}},watch:{$route:{handler:function(n){this.redirect=n.query&&n.query.redirect},immediate:!0}},methods:{showPwd:function(){var n=this;"password"===this.passwordType?this.passwordType="":this.passwordType="password",this.$nextTick((function(){n.$refs.password.focus()}))},handleLogin:function(){var n=this;this.$refs.loginForm.validate((function(t){if(!t)return console.log("error submit!!"),!1;n.loading=!0,n.$store.dispatch("user/login",n.loginForm).then((function(){n.$router.push({path:n.redirect||"/"}),n.loading=!1})).catch((function(t){40100===t?n.$message({message:"登录失败，账号或密码错误",type:"error",duration:6e3}):n.$message({message:t,type:"error",duration:6e3}),n.loading=!1}))}))}}},i=a,r=(e("2017"),e("2f1a"),e("2877")),c=Object(r["a"])(i,s,o,!1,null,"3236c4fa",null);t["default"]=c.exports},b12d:function(n,t,e){},fa65:function(n,t,e){}}]);