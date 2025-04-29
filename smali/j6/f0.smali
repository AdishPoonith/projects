.class public final synthetic Lj6/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/u;


# instance fields
.field public final synthetic a:Lj6/p0;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic d:Lq6/g;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lq6/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/f0;->a:Lj6/p0;

    iput-object p2, p0, Lj6/f0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lj6/f0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lj6/f0;->d:Lq6/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lj6/f0;->a:Lj6/p0;

    iget-object v1, p0, Lj6/f0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Lj6/f0;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v3, p0, Lj6/f0;->d:Lq6/g;

    check-cast p1, Lh6/j;

    invoke-static {v0, v1, v2, v3, p1}, Lj6/p0;->u(Lj6/p0;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lq6/g;Lh6/j;)V

    return-void
.end method
