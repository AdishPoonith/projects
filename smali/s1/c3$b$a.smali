.class public final Ls1/c3$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/c3$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final b:[I


# instance fields
.field private final a:Lp3/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Ls1/c3$b$a;->b:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp3/l$b;

    invoke-direct {v0}, Lp3/l$b;-><init>()V

    iput-object v0, p0, Ls1/c3$b$a;->a:Lp3/l$b;

    return-void
.end method


# virtual methods
.method public a(I)Ls1/c3$b$a;
    .locals 1

    iget-object v0, p0, Ls1/c3$b$a;->a:Lp3/l$b;

    invoke-virtual {v0, p1}, Lp3/l$b;->a(I)Lp3/l$b;

    return-object p0
.end method

.method public b(Ls1/c3$b;)Ls1/c3$b$a;
    .locals 1

    iget-object v0, p0, Ls1/c3$b$a;->a:Lp3/l$b;

    invoke-static {p1}, Ls1/c3$b;->b(Ls1/c3$b;)Lp3/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp3/l$b;->b(Lp3/l;)Lp3/l$b;

    return-object p0
.end method

.method public varargs c([I)Ls1/c3$b$a;
    .locals 1

    iget-object v0, p0, Ls1/c3$b$a;->a:Lp3/l$b;

    invoke-virtual {v0, p1}, Lp3/l$b;->c([I)Lp3/l$b;

    return-object p0
.end method

.method public d(IZ)Ls1/c3$b$a;
    .locals 1

    iget-object v0, p0, Ls1/c3$b$a;->a:Lp3/l$b;

    invoke-virtual {v0, p1, p2}, Lp3/l$b;->d(IZ)Lp3/l$b;

    return-object p0
.end method

.method public e()Ls1/c3$b;
    .locals 3

    new-instance v0, Ls1/c3$b;

    iget-object v1, p0, Ls1/c3$b$a;->a:Lp3/l$b;

    invoke-virtual {v1}, Lp3/l$b;->e()Lp3/l;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls1/c3$b;-><init>(Lp3/l;Ls1/c3$a;)V

    return-object v0
.end method
