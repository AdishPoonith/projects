.class public final synthetic Ll6/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/o0$d;


# direct methods
.method public synthetic constructor <init>(Ll6/o0$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/m0;->a:Ll6/o0$d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll6/m0;->a:Ll6/o0$d;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v0, p1}, Ll6/o0$d;->b(Ljava/lang/Long;)V

    return-void
.end method
