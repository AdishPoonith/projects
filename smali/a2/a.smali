.class public final synthetic La2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/a$d;


# instance fields
.field public final synthetic a:Lx1/v;


# direct methods
.method public synthetic constructor <init>(Lx1/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/a;->a:Lx1/v;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, La2/a;->a:Lx1/v;

    invoke-virtual {v0, p1, p2}, Lx1/v;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
