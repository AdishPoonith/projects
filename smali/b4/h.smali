.class public Lb4/h;
.super Lb4/n;
.source "SourceFile"


# instance fields
.field private final k:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lb4/n;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    iput p1, p0, Lb4/h;->k:I

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lb4/h;->k:I

    return v0
.end method
