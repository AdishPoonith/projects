.class public final synthetic Lo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/net/URL;

.field public final synthetic k:Lkotlin/jvm/internal/s;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/util/concurrent/locks/ReentrantLock;

.field public final synthetic n:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public synthetic constructor <init>(Ljava/net/URL;Lkotlin/jvm/internal/s;Ljava/lang/String;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/b;->j:Ljava/net/URL;

    iput-object p2, p0, Lo1/b;->k:Lkotlin/jvm/internal/s;

    iput-object p3, p0, Lo1/b;->l:Ljava/lang/String;

    iput-object p4, p0, Lo1/b;->m:Ljava/util/concurrent/locks/ReentrantLock;

    iput-object p5, p0, Lo1/b;->n:Ljava/util/concurrent/locks/Condition;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lo1/b;->j:Ljava/net/URL;

    iget-object v1, p0, Lo1/b;->k:Lkotlin/jvm/internal/s;

    iget-object v2, p0, Lo1/b;->l:Ljava/lang/String;

    iget-object v3, p0, Lo1/b;->m:Ljava/util/concurrent/locks/ReentrantLock;

    iget-object v4, p0, Lo1/b;->n:Ljava/util/concurrent/locks/Condition;

    invoke-static {v0, v1, v2, v3, v4}, Lo1/c;->a(Ljava/net/URL;Lkotlin/jvm/internal/s;Ljava/lang/String;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;)V

    return-void
.end method
