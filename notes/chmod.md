# chmod command

_The "chmod" command allows you to modify the read, write, and execute permissions for the owner, group, and others._

### general syntax for chmod command

`chmod [options] permissions file/directory`

**Options:**

- **`u`**: User/Owner
- **`g`**: Group
- **`o`**: Others (everyone else)
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
- **`1`**: Execute permission (--x)
- **`2`**: Write permission (-w-)
- **`3`**: Write and execute permissions (-wx)
- **`4`**: Read permission (r--)
- **`5`**: Read and execute permissions (r-x)
- **`6`**: Read and write permissions (rw-)
- **`7`**: Read, write, and execute permissions (rwx)
