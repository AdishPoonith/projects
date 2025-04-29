.class final Lj6/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj6/b1;

.field private final b:I

.field private final c:Lj6/w1;


# direct methods
.method constructor <init>(Lj6/b1;ILj6/w1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/d1;->a:Lj6/b1;

    iput p2, p0, Lj6/d1;->b:I

    iput-object p3, p0, Lj6/d1;->c:Lj6/w1;

    return-void
.end method


# virtual methods
.method public a()Lj6/b1;
    .locals 1

    iget-object v0, p0, Lj6/d1;->a:Lj6/b1;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lj6/d1;->b:I

    return v0
.end method

.method public c()Lj6/w1;
    .locals 1

    iget-object v0, p0, Lj6/d1;->c:Lj6/w1;

    return-object v0
.end method
