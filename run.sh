#!/bin/bash
set -e

LANGUAGE=$1

case $LANGUAGE in
  python|py)
    echo "======================================"
    echo "🚀 Running Python API Tests (pytest)..."
    echo "======================================"
    pip install -r python/requirements.txt --quiet
    pytest python/test_api.py -v
    ;;
  javascript|js)
    echo "======================================"
    echo "🚀 Running JavaScript API Tests (jest)..."
    echo "======================================"
    npm --prefix javascript install --quiet
    npm --prefix javascript test
    ;;
  java)
    echo "======================================"
    echo "🚀 Running Java API Tests (REST Assured)..."
    echo "======================================"
    mvn -f java/pom.xml clean test
    ;;
  *)
    echo "❌ Error: Invalid or missing language selection."
    echo "Usage: ./run.sh [python|js|java]"
    exit 1
    ;;
esac
