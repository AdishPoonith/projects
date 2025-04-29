.class public final synthetic Ls1/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/e2;

.field public final synthetic k:Lcom/google/common/collect/q$a;

.field public final synthetic l:Lu2/u$b;


# direct methods
.method public synthetic constructor <init>(Ls1/e2;Lcom/google/common/collect/q$a;Lu2/u$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/d2;->j:Ls1/e2;

    iput-object p2, p0, Ls1/d2;->k:Lcom/google/common/collect/q$a;

    iput-object p3, p0, Ls1/d2;->l:Lu2/u$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls1/d2;->j:Ls1/e2;

    iget-object v1, p0, Ls1/d2;->k:Lcom/google/common/collect/q$a;

    iget-object v2, p0, Ls1/d2;->l:Lu2/u$b;

    invoke-static {v0, v1, v2}, Ls1/e2;->a(Ls1/e2;Lcom/google/common/collect/q$a;Lu2/u$b;)V

    return-void
.end method
