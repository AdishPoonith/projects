.class public final synthetic La9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lcom/google/common/util/concurrent/h;

.field public final synthetic k:Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/h;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/b;->j:Lcom/google/common/util/concurrent/h;

    iput-object p2, p0, La9/b;->k:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La9/b;->j:Lcom/google/common/util/concurrent/h;

    iget-object v1, p0, La9/b;->k:Ljava/util/concurrent/Callable;

    invoke-static {v0, v1}, La9/c;->a(Lcom/google/common/util/concurrent/h;Ljava/util/concurrent/Callable;)V

    return-void
.end method
