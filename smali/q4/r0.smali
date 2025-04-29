.class final Lq4/r0;
.super Lq4/q0;
.source "SourceFile"


# static fields
.field static final n:Lq4/q0;


# instance fields
.field final transient l:[Ljava/lang/Object;

.field private final transient m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq4/r0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lq4/r0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lq4/r0;->n:Lq4/q0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lq4/q0;-><init>()V

    iput-object p1, p0, Lq4/r0;->l:[Ljava/lang/Object;

    iput p2, p0, Lq4/r0;->m:I

    return-void
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lq4/r0;->l:[Ljava/lang/Object;

    iget v0, p0, Lq4/r0;->m:I

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lq4/r0;->m:I

    return p1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lq4/r0;->m:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lq4/r0;->m:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lq4/k0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lq4/r0;->l:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method final k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final q()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq4/r0;->l:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lq4/r0;->m:I

    return v0
.end method
