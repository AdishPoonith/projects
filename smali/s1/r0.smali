.class public final synthetic Ls1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls1/c3$e;

.field public final synthetic c:Ls1/c3$e;


# direct methods
.method public synthetic constructor <init>(ILs1/c3$e;Ls1/c3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls1/r0;->a:I

    iput-object p2, p0, Ls1/r0;->b:Ls1/c3$e;

    iput-object p3, p0, Ls1/r0;->c:Ls1/c3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Ls1/r0;->a:I

    iget-object v1, p0, Ls1/r0;->b:Ls1/c3$e;

    iget-object v2, p0, Ls1/r0;->c:Ls1/c3$e;

    check-cast p1, Ls1/c3$d;

    invoke-static {v0, v1, v2, p1}, Ls1/x0;->b0(ILs1/c3$e;Ls1/c3$e;Ls1/c3$d;)V

    return-void
.end method
