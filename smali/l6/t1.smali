.class public final synthetic Ll6/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/t;


# instance fields
.field public final synthetic a:Ll6/u1;


# direct methods
.method public synthetic constructor <init>(Ll6/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/t1;->a:Ll6/u1;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll6/t1;->a:Ll6/u1;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Ll6/u1;->g(Ll6/u1;Landroid/database/Cursor;)Ln6/k;

    move-result-object p1

    return-object p1
.end method
