.class public final synthetic Lj6/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lj6/p0;

.field public final synthetic b:Lcom/google/firebase/firestore/e1;

.field public final synthetic c:Lq6/t;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Lcom/google/firebase/firestore/e1;Lq6/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/b0;->a:Lj6/p0;

    iput-object p2, p0, Lj6/b0;->b:Lcom/google/firebase/firestore/e1;

    iput-object p3, p0, Lj6/b0;->c:Lq6/t;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj6/b0;->a:Lj6/p0;

    iget-object v1, p0, Lj6/b0;->b:Lcom/google/firebase/firestore/e1;

    iget-object v2, p0, Lj6/b0;->c:Lq6/t;

    invoke-static {v0, v1, v2}, Lj6/p0;->j(Lj6/p0;Lcom/google/firebase/firestore/e1;Lq6/t;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
