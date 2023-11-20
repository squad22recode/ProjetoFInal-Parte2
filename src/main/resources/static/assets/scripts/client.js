const anchor = document.querySelector("#deleteModal form a")
const table = document.querySelector(".table")
const checkboxs = document.querySelectorAll("#checkboxNoLabel")
const btnDeletes = document.querySelector("#btn-deletes")
const checkboxMain = document.querySelector(".check-main")

let ids = []

checkboxMain.addEventListener("change", () => {

  if (checkboxMain.checked) {
    ids = []
    checkboxs.forEach(checkbox => {
      checkbox.checked = true
      ids.push(checkbox.value)
    })
    btnDeletes.classList.remove("disabled")
    btnDeletes.removeAttribute("disabled")

    if (btnDeletes instanceof HTMLAnchorElement) {
      btnDeletes.href = `/clientes/excluir?ids=${ids.join(',')}`
    }
  }
  else {
    checkboxs.forEach(checkbox => checkbox.checked = false)
    btnDeletes.classList.add("disabled")
    btnDeletes.setAttribute("disabled", '')
  }

})

table.addEventListener("click", (e) => {
  const id = e.target.dataset.delete

  if (e.target.classList.contains("trash")) {
    if (anchor instanceof HTMLAnchorElement) {
      anchor.href = `/clientes/excluir/${id}`
    }
  }
})

