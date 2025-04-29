.class public final synthetic Ls1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Ls1/z2;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ls1/z2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/i0;->a:Ls1/z2;

    iput p2, p0, Ls1/i0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls1/i0;->a:Ls1/z2;

    iget v1, p0, Ls1/i0;->b:I

    check-cast p1, Ls1/c3$d;

    invoke-static {v0, v1, p1}, Ls1/x0;->l0(Ls1/z2;ILs1/c3$d;)V

    return-void
.end method
