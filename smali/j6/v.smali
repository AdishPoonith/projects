.class public final synthetic Lj6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/p0;

.field public final synthetic k:Lj6/b1;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Lj6/b1;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/v;->j:Lj6/p0;

    iput-object p2, p0, Lj6/v;->k:Lj6/b1;

    iput-object p3, p0, Lj6/v;->l:Ljava/util/List;

    iput-object p4, p0, Lj6/v;->m:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj6/v;->j:Lj6/p0;

    iget-object v1, p0, Lj6/v;->k:Lj6/b1;

    iget-object v2, p0, Lj6/v;->l:Ljava/util/List;

    iget-object v3, p0, Lj6/v;->m:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2, v3}, Lj6/p0;->n(Lj6/p0;Lj6/b1;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
