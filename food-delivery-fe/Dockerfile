# Stage 1: Build the Angular app
FROM node:22.12.0 as build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# Stage 2: Serve the Angular app using Nginx
FROM nginx:alpine
COPY --from=build /app/dist/food-delivery-fe /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]