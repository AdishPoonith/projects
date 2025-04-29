.class final Ld2/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ld2/e;


# direct methods
.method private constructor <init>(Ld2/e;)V
    .locals 0

    iput-object p1, p0, Ld2/e$b;->a:Ld2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ld2/e;Ld2/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld2/e$b;-><init>(Ld2/e;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1}, Ld2/e;->p(I)V

    return-void
.end method

.method public b(I)I
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1}, Ld2/e;->v(I)I

    move-result p1

    return p1
.end method

.method public c(ID)V
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1, p2, p3}, Ld2/e;->s(ID)V

    return-void
.end method

.method public d(I)Z
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1}, Ld2/e;->A(I)Z

    move-result p1

    return p1
.end method

.method public e(IILx1/m;)V
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1, p2, p3}, Ld2/e;->m(IILx1/m;)V

    return-void
.end method

.method public f(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1, p2}, Ld2/e;->I(ILjava/lang/String;)V

    return-void
.end method

.method public g(IJJ)V
    .locals 6

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ld2/e;->H(IJJ)V

    return-void
.end method

.method public h(IJ)V
    .locals 1

    iget-object v0, p0, Ld2/e$b;->a:Ld2/e;

    invoke-virtual {v0, p1, p2, p3}, Ld2/e;->y(IJ)V

    return-void
.end method
