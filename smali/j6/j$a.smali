.class public Lj6/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lq6/g;

.field private final c:Lj6/m;

.field private final d:Lp6/o;

.field private final e:Lh6/j;

.field private final f:I

.field private final g:Lcom/google/firebase/firestore/a0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq6/g;Lj6/m;Lp6/o;Lh6/j;ILcom/google/firebase/firestore/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/j$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lj6/j$a;->b:Lq6/g;

    iput-object p3, p0, Lj6/j$a;->c:Lj6/m;

    iput-object p4, p0, Lj6/j$a;->d:Lp6/o;

    iput-object p5, p0, Lj6/j$a;->e:Lh6/j;

    iput p6, p0, Lj6/j$a;->f:I

    iput-object p7, p0, Lj6/j$a;->g:Lcom/google/firebase/firestore/a0;

    return-void
.end method


# virtual methods
.method a()Lq6/g;
    .locals 1

    iget-object v0, p0, Lj6/j$a;->b:Lq6/g;

    return-object v0
.end method

.method b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lj6/j$a;->a:Landroid/content/Context;

    return-object v0
.end method

.method c()Lj6/m;
    .locals 1

    iget-object v0, p0, Lj6/j$a;->c:Lj6/m;

    return-object v0
.end method

.method d()Lp6/o;
    .locals 1

    iget-object v0, p0, Lj6/j$a;->d:Lp6/o;

    return-object v0
.end method

.method e()Lh6/j;
    .locals 1

    iget-object v0, p0, Lj6/j$a;->e:Lh6/j;

    return-object v0
.end method

.method f()I
    .locals 1

    iget v0, p0, Lj6/j$a;->f:I

    return v0
.end method

.method g()Lcom/google/firebase/firestore/a0;
    .locals 1

    iget-object v0, p0, Lj6/j$a;->g:Lcom/google/firebase/firestore/a0;

    return-object v0
.end method
