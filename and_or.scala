val stmt_error = "This is a line containg errror"
val stmt_warn = "This lline contains warning"

println(stmt_warn.contains("fool") || stmt_warn.contains("warning"))

println(stmt_warn.contains("fool") && stmt_warn.contains("error"))
