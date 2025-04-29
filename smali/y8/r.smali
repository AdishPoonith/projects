.class public final synthetic Ly8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ly8/t;

.field public final synthetic k:Ljava/util/Map;

.field public final synthetic l:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Ly8/t;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/r;->j:Ly8/t;

    iput-object p2, p0, Ly8/r;->k:Ljava/util/Map;

    iput-object p3, p0, Ly8/r;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly8/r;->j:Ly8/t;

    iget-object v1, p0, Ly8/r;->k:Ljava/util/Map;

    iget-object v2, p0, Ly8/r;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Ly8/t;->f(Ly8/t;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
