// TypeChecking/AnyName.kt
// (c)2020 Mindview LLC. See Copyright.txt for permissions.
package typechecking

val Any.name
  get() = this::class.simpleName
