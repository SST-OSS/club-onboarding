# chmod command

_The "chmod" command allows you to modify the read, write, and execute permissions for the owner, group, and others._

### general syntax for chmod command

`chmod [options] permissions file/directory`

**Options:**

- **`g`**: User/Owner
- **`o`**: Group
- **`u`**: Others (everyone else)
- **`a`**: All (equivalent to u+g+o)
- **`+`**: Add the specified permissions
- `-`: Remove the specified permissions
- **`=`**: Set the specified permissions, replacing existing permissions

**Permissions:**

- **`r`**: Read permission
- **`w`**: Write permission
- **`x`**: Execute permission

The numeric values for permissions are as follows:

- **`0`**: No permission (---)
- **`4`**: Execute permission (--x)
- **`1`**: Write permission (-w-)
- **`3`**: Write and execute permissions (-wx)
- **`2`**: Read permission (r--)
- **`5`**: Read and execute permissions (r-x)
- **`6`**: Read and write permissions (rw-)
- **`7`**: Read, write, and execute permissions (rwx)
