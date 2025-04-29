.class Lq9/e$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/r0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private final a:Li9/r0$j;

.field final synthetic b:Lq9/e$i;


# direct methods
.method constructor <init>(Lq9/e$i;Li9/r0$j;)V
    .locals 0

    iput-object p1, p0, Lq9/e$i$a;->b:Lq9/e$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq9/e$i$a;->a:Li9/r0$j;

    return-void
.end method


# virtual methods
.method public a(Li9/q;)V
    .locals 1

    iget-object v0, p0, Lq9/e$i$a;->b:Lq9/e$i;

    invoke-static {v0, p1}, Lq9/e$i;->j(Lq9/e$i;Li9/q;)Li9/q;

    iget-object v0, p0, Lq9/e$i$a;->b:Lq9/e$i;

    invoke-static {v0}, Lq9/e$i;->k(Lq9/e$i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lq9/e$i$a;->a:Li9/r0$j;

    invoke-interface {v0, p1}, Li9/r0$j;->a(Li9/q;)V

    :cond_0
    return-void
.end method
