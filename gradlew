#!/bin/sh
set -e
if command -v gradle >/dev/null 2>&1; then
  exec gradle "$@"
fi
echo "Gradle is not installed or not available on PATH." >&2
exit 1
