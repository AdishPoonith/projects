.class public Lcom/google/firebase/auth/q;
.super Lw5/l;
.source "SourceFile"


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Lw5/l;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/auth/q;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/q;->j:Ljava/lang/String;

    return-object v0
.end method
