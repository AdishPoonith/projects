.class public final synthetic Ly8/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ly8/h0;

.field public final synthetic k:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/b0;->j:Ly8/h0;

    iput-object p2, p0, Ly8/b0;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly8/b0;->j:Ly8/h0;

    iget-object v1, p0, Ly8/b0;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Ly8/h0;->c(Ly8/h0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
