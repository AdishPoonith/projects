.class public final synthetic Ls1/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls1/y0;->a:I

    iput-boolean p2, p0, Ls1/y0;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Ls1/y0;->a:I

    iget-boolean v1, p0, Ls1/y0;->b:Z

    check-cast p1, Ls1/c3$d;

    invoke-static {v0, v1, p1}, Ls1/x0$c;->J(IZLs1/c3$d;)V

    return-void
.end method
