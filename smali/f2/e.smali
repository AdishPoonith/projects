.class public final synthetic Lf2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# instance fields
.field public final synthetic j:Lf2/g;


# direct methods
.method public synthetic constructor <init>(Lf2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/e;->j:Lf2/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf2/e;->j:Lf2/g;

    check-cast p1, Lf2/o;

    invoke-virtual {v0, p1}, Lf2/g;->o(Lf2/o;)Lf2/o;

    move-result-object p1

    return-object p1
.end method
