.class public final synthetic La9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:La9/c$a;

.field public final synthetic k:Lcom/google/common/util/concurrent/d;


# direct methods
.method public synthetic constructor <init>(La9/c$a;Lcom/google/common/util/concurrent/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/a;->j:La9/c$a;

    iput-object p2, p0, La9/a;->k:Lcom/google/common/util/concurrent/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La9/a;->j:La9/c$a;

    iget-object v1, p0, La9/a;->k:Lcom/google/common/util/concurrent/d;

    invoke-static {v0, v1}, La9/c;->b(La9/c$a;Lcom/google/common/util/concurrent/d;)V

    return-void
.end method
